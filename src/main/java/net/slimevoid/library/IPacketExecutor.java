/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version. This program is distributed in the hope that it will be
 * useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details. You should have received a copy of the GNU
 * Lesser General Public License along with this program. If not, see
 * <http://www.gnu.org/licenses/>
 */
package net.slimevoid.library;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.slimevoid.library.network.PacketUpdate;

public interface IPacketExecutor {

    /**
     * Execute the packet.
     * 
     * @param packet
     *                     The Packet Data.
     * @param world
     *                     The world object.
     * @param entityplayer
     *                     The player associated with the current Packet Data
     */
    public void execute(PacketUpdate packet, World world, EntityPlayer entityplayer);
}
