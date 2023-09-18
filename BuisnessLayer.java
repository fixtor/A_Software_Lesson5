import java.util.Collection;

public interface BuisnessLayer {
    Collection<Model3d> getAllModels();
    Collection<Texture> getAllTextures();
    void renderModel(Model3d model3d);
    void renderAllModels();
    void removeModel(Model3d model3d);
}
