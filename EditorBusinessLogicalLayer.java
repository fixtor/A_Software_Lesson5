import java.util.Collection;
import java.util.Random;

public class EditorBusinessLogicalLayer implements BuisnessLayer {

    private DataBaseAccess dataBaseAccess;

    public EditorBusinessLogicalLayer(DataBaseAccess dataBaseAccess) {
        this.dataBaseAccess = dataBaseAccess;
    }

    public void removeModel(Model3d model3d){
        dataBaseAccess.removeEntity(model3d);
    }
    @Override
    public Collection<Model3d> getAllModels() {
        return dataBaseAccess.getAllModel3d();
    }

    @Override
    public Collection<Texture> getAllTextures() {
        return dataBaseAccess.getAllTexture();
    }

    @Override
    public void renderModel(Model3d model3d) {
        processRender(model3d);
    }

    @Override
    public void renderAllModels() {
        for (Model3d model3d : getAllModels()) {
            processRender(model3d);
        }
    }

    private Random random = new Random();

    private void processRender(Model3d model3d) {
        try {
            Thread.sleep(2500 - random.nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
