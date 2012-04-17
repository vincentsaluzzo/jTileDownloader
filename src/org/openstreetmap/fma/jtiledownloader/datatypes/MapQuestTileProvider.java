/*
 * Copyright 2012, Vincent Saluzzo <vincentsaluzzo@gmail.com>
 * 
 * This file is part of JTileDownloader.
 *
 * JTileDownloader is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JTileDownloader is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy (see file COPYING.txt) of the GNU 
 * General Public License along with JTileDownloader.
 * If not, see <http://www.gnu.org/licenses/>.
 */

package org.openstreetmap.fma.jtiledownloader.datatypes;

/**
 * MapQuest Tile Provider
 */
public class MapQuestTileProvider
    extends RotatingTileProvider
{
    private final static String[] SUBDOMAINS = { "otile1", "otile2", "otile3", "otile4" };

    public MapQuestTileProvider()
    {
        url = "http://{0}.mqcdn.com/tiles/1.0.0/osm/";
    }

    /**
     * @see org.openstreetmap.fma.jtiledownloader.datatypes.RotatingTileProvider#getSubDomains()
     */
    @Override
    protected String[] getSubDomains()
    {
        return SUBDOMAINS;
    }

    /**
     * @see org.openstreetmap.fma.jtiledownloader.datatypes.GenericTileProvider#getName()
     */
    @Override
    public String getName()
    {
        return "MapQuest";
    }

    /**
     * @see org.openstreetmap.fma.jtiledownloader.datatypes.GenericTileProvider#getMaxZoom()
     */
    @Override
    public int getMaxZoom()
    {
        return 20;
    }
}
