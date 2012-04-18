jTilesDownloader
=================


**JTileDownloader** is a **Java application** for downloading OSM tiles. You can paste a 'Permlink' to the application, select a radius in km and zoomlevel, select a renderer and download the tiles.
The application is free and the source code is available under the GPL.

The original source code is available on [OpenStreetMap WebSite](http://wiki.openstreetmap.org/wiki/JTileDownloader)


Why this new repository on GitHub ?
-----------------------------------

I need an Tile Downloader simple and easier to use for a personal project. I find this simple tool but the last update from the SVN on OSM but it not include [MapQuest tiles sources](http://developer.mapquest.com/web/products/open/map).

Also, today, GitHub is the most effective website to purpose Open Source project, so I re-host this project on GitHub.


Added Features
--------------

* MapQuest Tiles Provider added
* Modify of Thread slider up to 64 threads max (original is 4 threads max...)
* Bugs corrections:
	* replace Integer.compare (static method) with Integer.compareTo (non-static method) to success compile
	

Licence
=======

The licence of this project stay the same as provided in the OSM wiki website: GNU GPL3

