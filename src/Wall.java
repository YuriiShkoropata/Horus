import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure, CompositeBlock {
    private final List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return blocks
                .stream()
                .filter(b -> b.getColor().equals(color))
                .findAny();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blocks
                .stream()
                .filter(b -> b.getMaterial().equals(material))
                .collect(Collectors.toList());
    }

    @Override
    public int count() {
        return blocks.size();
    }

    @Override
    public String getColor() {
        List<String> colors = new ArrayList<>();
        for (Block color : blocks) {
            if (!colors.contains(color.getColor())) {
                colors.add(color.getColor());
            }
        }
        StringBuilder allColors = new StringBuilder();
        for (String s : colors) {
            allColors.append(s);
            allColors.append("\t");
        }
        return String.valueOf(allColors);
    }

    @Override
    public String getMaterial() {
        List<String> materials = new ArrayList<>();
        for (Block material : blocks) {
            if (!materials.contains(material.getMaterial())) {
                materials.add(material.getMaterial());
            }
        }
        StringBuilder allMaterials = new StringBuilder();
        for (String s : materials) {
            allMaterials.append(s);
            allMaterials.append("\t");
        }
        return String.valueOf(allMaterials);
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }
}
