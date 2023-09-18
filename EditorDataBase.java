import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class EditorDataBase implements DataBase {
    private Random random = new Random();
    private ProjectFile projectFile;
    private Collection<Entity> entities;

    public EditorDataBase(ProjectFile projectFile) {
        this.projectFile = projectFile;
        loda();
    }

    @Override
    public void loda() {
        //TODO загрузка всех сущностей

    }

    @Override
    public void save() {
        //TODO Сохранение всех сущностей
    }

    public Collection<Entity> getAll() {
        if (entities == null) {
            entities = new ArrayList<>();
            int entitiesCount = random.nextInt(5, 11);
            for (int i = 0; i < entitiesCount; i++) {
                generateModelAAndTextures();
            }
        }
        return entities;
    }

    private void generateModelAAndTextures() {
        Model3d model3d = new Model3d();
        int txCount = random.nextInt(3);
        for (int i = 0; i < txCount; i++) {
            Texture texture = new Texture();
            model3d.getTextures().add(texture);
            entities.add(texture);
        }
        entities.add(model3d);
    }
}
