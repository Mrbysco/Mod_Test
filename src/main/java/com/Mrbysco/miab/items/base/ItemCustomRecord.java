package com.Mrbysco.miab.items.base;

import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import com.Mrbysco.miab.MemeInABottle;
import com.google.common.collect.Maps;

import net.minecraft.block.BlockJukebox;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemCustomRecord extends ItemRecord{

    private static final Map<SoundEvent, ItemCustomRecord> RECORDS = Maps.<SoundEvent, ItemCustomRecord>newHashMap();
    private final String displayName;
    private final SoundEvent sound;
    
	public ItemCustomRecord(String name, SoundEvent soundIn, String unlocalized, String registry)
	{
		super(name, soundIn);
		setCreativeTab(MemeInABottle.memetab);
        setUnlocalizedName(unlocalized);
		setRegistryName(registry);
		this.displayName = "item.record." + name + ".desc";
		this.sound = soundIn;
        this.maxStackSize = 1;
		RECORDS.put(this.sound, this);
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        IBlockState iblockstate = worldIn.getBlockState(pos);

        if (iblockstate.getBlock() == Blocks.JUKEBOX && !((Boolean)iblockstate.getValue(BlockJukebox.HAS_RECORD)).booleanValue())
        {
            if (!worldIn.isRemote)
            {
                ItemStack itemstack = player.getHeldItem(hand);
                ((BlockJukebox)Blocks.JUKEBOX).insertRecord(worldIn, pos, iblockstate, itemstack);
                worldIn.playEvent((EntityPlayer)null, 1010, pos, Item.getIdFromItem(this));
                itemstack.shrink(1);
                player.addStat(StatList.RECORD_PLAYED);
            }

            return EnumActionResult.SUCCESS;
        }
        else
        {
            return EnumActionResult.PASS;
        }
    }

    /**
     * allows items to add custom lines of information to the mouseover description
     */
	@SideOnly(Side.CLIENT)
	@Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add(this.getRecordNameLocal());
    }

    @SideOnly(Side.CLIENT)
    @Override
    public String getRecordNameLocal()
    {
        return I18n.translateToLocal(this.displayName);
    }

    @Nullable
    @SideOnly(Side.CLIENT)
    public static ItemCustomRecord getBySound(SoundEvent soundIn)
    {
        return RECORDS.get(soundIn);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public SoundEvent getSound()
    {
        return this.sound;
    }
}