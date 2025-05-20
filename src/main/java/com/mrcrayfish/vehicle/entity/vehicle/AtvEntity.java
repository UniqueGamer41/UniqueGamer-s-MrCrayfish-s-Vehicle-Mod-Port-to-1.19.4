package com.mrcrayfish.vehicle.entity.vehicle;

import com.mrcrayfish.vehicle.entity.LandVehicleEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class AtvEntity extends LandVehicleEntity
{
    public AtvEntity(EntityType<? extends AtvEntity> type, Level worldIn) {super(type, worldIn);}
}
