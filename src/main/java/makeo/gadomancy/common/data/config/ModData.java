package makeo.gadomancy.common.data.config;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import cpw.mods.fml.common.FMLLog;
import makeo.gadomancy.common.Gadomancy;
import net.minecraft.server.MinecraftServer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * This class is part of the Gadomancy Mod
 * Gadomancy is Open Source and distributed under the
 * GNU LESSER GENERAL PUBLIC LICENSE
 * for more read the LICENSE file
 *
 * Created by makeo @ 26.07.2015 18:15
 * Modified by bartimaeusnek @ 31.12.2018, 19:00 GMT+1
 */
public class ModData {
    private static final Gson GSON = new Gson();

    private String name;
    private File file;

    private Map<String, Object> data = new HashMap<String, Object>();

    public ModData(String name, File directory) {
        if(directory == null)
            throw new IllegalArgumentException("Directory is null!");

        this.name = name;
        this.file = new File(directory, name + ".dat");
    }

    public ModData(String name) {
        this(name, geDefaultDirectory());
    }

    private static File geDefaultDirectory() {
        MinecraftServer server = MinecraftServer.getServer();
        if(server != null && server.getEntityWorld() != null) {
            File file = server.getEntityWorld().getSaveHandler().getWorldDirectory();
            if(file != null) {
                return new File(file, Gadomancy.MODID);
            }
        }
        return null;
    }

    public <T> T get(String key, T defaultValue) {
        if(data.containsKey(key)) {
            return (T) data.get(key);
        }
        data.put(key, defaultValue);
        return defaultValue;
    }

    public <T> T get(String key) {
        return get(key, null);
    }

    public void set(String key, Object value) {
        data.put(key, value);
    }

    public boolean contains(String key) {
        return data.containsKey(key);
    }

    public boolean load() {
        if(file != null && file.exists()) {
        	ObjectInputStream inOBJ = null;
            FileInputStream in = null;
            try {
                in = new FileInputStream(file);
                inOBJ = new ObjectInputStream(in);
                data = (Map<String, Object>) inOBJ.readObject();
            } catch (IOException | ClassCastException | JsonSyntaxException | ClassNotFoundException e) { //
                e.printStackTrace();
                try {
                    if (inOBJ != null)
					    inOBJ.close();
                    if (in != null)
					    in.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                return false;
            } finally {
                    try {
                        if (inOBJ != null)
                    	    inOBJ.close();
                        if (in != null)
                            in.close();
                    } catch (IOException ignored) { }
            }
        }
        return true;
    }

    public boolean save() {
        if(!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
            FMLLog.warning("Failed to create directory: \"" + file.toString() + "\"!");
            return false;
        }

        FileOutputStream out = null;
        ObjectOutputStream outOBJ = null;
        try {
            if(!file.exists())
                file.createNewFile();

            out = new FileOutputStream(file);
            outOBJ = new ObjectOutputStream(out);
            outOBJ.writeObject(data);
        } catch (JsonIOException | IOException e) {
            e.printStackTrace();
            try {
                if (outOBJ != null)
				    outOBJ.close();
                if(out != null)
				    out.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
            return false;
        } finally {
                try {
                    if(outOBJ != null)
                	    outOBJ.close();
                    if(out != null)
                        out.close();
                } catch (IOException ignored) { }
        }
        return true;
    }
}
