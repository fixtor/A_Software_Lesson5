import java.util.Collection;

public interface DataBaseAccess {
    public void addEntity(Entity entity);

    public void removeEntity(Entity entity);

    Collection<Texture> getAllTexture();

    Collection<Model3d> getAllModel3d();

}
