package me.minecraft.star.gui;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.FurnaceContainer;
import net.minecraft.inventory.container.IContainerListener;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIntArray;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class TrainContainer extends FurnaceContainer implements INamedContainerProvider, IContainerListener{

	public static final ITextComponent TITLE = new TranslationTextComponent("TrainContainer");

	public static final String REG = "train_container";
	
	public TrainContainer(int p_i50083_1_, PlayerInventory p_i50083_2_, IInventory p_i50083_3_, IIntArray p_i50083_4_) {
		super(p_i50083_1_, p_i50083_2_, p_i50083_3_, p_i50083_4_);
	}


	public TrainContainer(int p_i50082_1_, PlayerInventory p_i50082_2_) {
		super(p_i50082_1_, p_i50082_2_);
	}


	@Override
	public Container createMenu(int p_createMenu_1_, PlayerInventory p_createMenu_2_, PlayerEntity p_createMenu_3_) {
		return new TrainContainer(p_createMenu_1_, p_createMenu_2_);
	}


	@Override
	public int getBurnProgress() {
		return super.getBurnProgress();
	}


	@Override
	public ITextComponent getDisplayName() {
		return TITLE;
	}


	@Override
	public void refreshContainer(Container p_71110_1_, NonNullList<ItemStack> p_71110_2_) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void slotChanged(Container p_71111_1_, int p_71111_2_, ItemStack p_71111_3_) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setContainerData(Container p_71112_1_, int p_71112_2_, int p_71112_3_) {
		// TODO Auto-generated method stub
		
	}



}
