/*
 * This file is part of MultiLoader Template. A copy of this program can be
 * found at https://github.com/Trikzon/MultiLoader-Template.
 * Copyright (C) 2023 Dion Tryban
 *
 * MultiLoader Template is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * MultiLoader Template is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with MultiLoader Template. If not, see <https://www.gnu.org/licenses/>.
 */
package com.diontryban.mods.example.fabric;

import com.diontryban.mods.example.ExampleMod;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleMod.LOG.info("Hello Fabric world!");
        ExampleMod.init();
    }
}