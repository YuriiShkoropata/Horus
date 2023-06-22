import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Block redBlock = new Block() {
            @Override
            public String getColor() {
                return "red";
            }

            @Override
            public String getMaterial() {
                return "brick";
            }
        };
        Block whiteBlock = new Block() {
            @Override
            public String getColor() {
                return "white";
            }

            @Override
            public String getMaterial() {
                return "stone";
            }
        };
        Block greyBlock = new Block() {
            @Override
            public String getColor() {
                return "grey";
            }

            @Override
            public String getMaterial() {
                return "stone";
            }
        };

        List<Block> blockList = new ArrayList<>();
        blockList.add(redBlock);
        blockList.add(whiteBlock);
        blockList.add(greyBlock);

        Wall wall = new Wall(blockList);

        System.out.println(wall.count());
        System.out.println(wall.findBlockByColor("red"));
        System.out.println(wall.getMaterial());
        System.out.println(wall.getBlocks());
        System.out.println(wall.getColor());
        System.out.println(wall.findBlocksByMaterial("stone"));

    }
}