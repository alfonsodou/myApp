package org.parallax3d.parallax.platforms.gwt.system.assets;

import org.parallax3d.parallax.platforms.gwt.system.assets.AssetDirectory;
import org.parallax3d.parallax.platforms.gwt.system.assets.AssetFile;
import org.parallax3d.parallax.platforms.gwt.system.assets.Asset;
import java.util.Collection;
import org.parallax3d.parallax.system.FastMap;

public class AssetsImpl implements org.parallax3d.parallax.platforms.gwt.system.assets.Assets {
  private static final FastMap<Asset> MAP = new FastMap<Asset>(){{
  put("assets", new AssetDirectory("assets") );
  put("helvetiker_bold.typeface.js", new AssetFile("helvetiker_bold.typeface.js", 61699, false, "application/javascript") );
  put("models", new AssetDirectory("models") );
  put("models/animated", new AssetDirectory("models/animated") );
  put("models/animated/horse.js", new AssetFile("models/animated/horse.js", 162404, true, "application/javascript") );
  }};
  public Collection<Asset> getAll() {
  return MAP.values();
  }
  public boolean contains(String path) {
  return MAP.containsKey(path);
  }
  public Asset get(String path) {
  if (MAP.containsKey(path)) {
  return MAP.get(path);
  }
  return null;
  }
}
