package com.mrcrayfish.vehicle.entity.vehicle;

import com.mrcrayfish.vehicle.entity.LandVehicleEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

/**
 * Author: MrCrayfish
 */
public class DuneBuggyEntity extends LandVehicleEntity
{
    public DuneBuggyEntity(EntityType<? extends DuneBuggyEntity> type, Level worldIn)
    {
        super(type, worldIn);
    }
}
