import java.util.ArrayList;
import java.util.Collection;

public class Model3d implements Entity {
    private static int counter = 10000;
    private int id;
    private Collection<Texture> textures = new ArrayList<>();

    @Override
    public int getId() {
        return id;
    }

    {
        id = ++counter;
    }

    public Model3d() {
    }

    public Model3d(Collection<Texture> textures) {
        this.textures = textures;
    }

    public Collection<Texture> getTextures() {
        return textures;
    }


    @Override
    public String toString() {
        return String.format("Model3d #%s", id);
    }
}
