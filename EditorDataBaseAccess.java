import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;

public class EditorDataBaseAccess implements DataBaseAccess {

    private DataBase editorDataBaseAccess;

    public EditorDataBaseAccess(DataBase editorDataBaseAccess) {
        this.editorDataBaseAccess = editorDataBaseAccess;
    }

    @Override
    public void addEntity(Entity entity) {
        editorDataBaseAccess.getAll().add(entity);
    }


    public void removeEntity(Entity entity) {
        editorDataBaseAccess.getAll().remove(entity);
    }

    @Override
    public Collection<Texture> getAllTexture() {
        Collection<Texture> models = new ArrayList<>();
        for (Entity entity : editorDataBaseAccess.getAll()) {
            if (entity instanceof Texture) {
                models.add((Texture) entity);
            }
        }
        return models;
    }

    @Override
    public Collection<Model3d> getAllModel3d() {
        Collection<Model3d> model3ds = new ArrayList<>();
        for (Entity entity : editorDataBaseAccess.getAll()) {
            if (entity instanceof Model3d) {
                model3ds.add((Model3d) entity);
            }
        }
        return model3ds;
    }

}
