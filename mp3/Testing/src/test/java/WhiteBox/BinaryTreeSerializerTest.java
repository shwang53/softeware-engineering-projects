package WhiteBox;

import BlackBox.CycleSort;
import Utils.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BinaryTreeSerializerTest {

    @Test
    public void serializeTest(){
        //@TODO: Delete/modify me
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        TreeNode root = null;
        String ret = bs.serialize(root);
        assertEquals("[null]",ret);
    }

    @Test
    public void deserializeTest(){
        //@TODO: Delete/modify me
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[null]";
        TreeNode root = null;
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }

    //@TODO: Create more tests


    @Test
    public void serializeTest2(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        TreeNode root = new TreeNode(1);
        String ret = bs.serialize(root);
        assertEquals("[1,null,null]",ret);
    }

    @Test
    public void deserializeTest2(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[1,null,null]";
        TreeNode root = new TreeNode(1);
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }

    @Test
    public void serializeTest3(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        String ret = bs.serialize(root);
        assertEquals("[1,null,2,null,null]",ret);
    }

    @Test
    public void deserializeTest3(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[1,null,2,null,null]";
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }


    @Test
    public void serializeTest4(){

        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        String ret = bs.serialize(root);
        System.out.println(ret);
        assertEquals("[1,2,3,4,5,6,7,null,null,null,null,null,null,null,null]",ret);
    }

    @Test
    public void deserializeTest4(){

        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[1,2,3,4,5,6,7,null,null,null,null,null,null,null,null]";
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }


    @Test
    public void deserializeTest5(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "1";
        TreeNode rootret = bs.deserialize(s);
        assertEquals(null, rootret);
    }


    @Test
    public void serializeTest6(){

        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(7);
        root.left.right.left.right = new TreeNode(7);
        root.left.right.left.left = new TreeNode(8);
        root.left.right.left.left.right = new TreeNode(9);
        root.left.right.left.left.right.left = new TreeNode(10);
        String ret = bs.serialize(root);
        System.out.println(ret);
        assertEquals("[4,5,null,4,6,null,null,7,null,8,7,null,9,null,null,10,null,null,null]",ret);


    }


    @Test
    public void deserializeTest6(){


        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[4,5,null,4,6,null,null,7,null,8,7,null,9,null,null,10,null,null,null]";
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(7);
        root.left.right.left.right = new TreeNode(7);
        root.left.right.left.left = new TreeNode(8);
        root.left.right.left.left.right = new TreeNode(9);
        root.left.right.left.left.right.left = new TreeNode(10);
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);


    }

    @Test
    public void serializeTest7(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        String ret = bs.serialize(root);
        assertEquals("[1,null,2,null,3,null,4,null,null]",ret);
    }


    @Test
    public void deserializeTest7(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[1,null,2,null,3,null,4,null,null,null,null,null]";
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }
}
