public class StaticBlockCheck {
    public static void main(String[] args) {
        StaticBlockCheck check = new StaticBlockCheck();
        check.makeStaticBlockObject();
        check.makeStaticBlockObjectWithData();
    }
    public void makeStaticBlockObject() {
        System.out.println("Creating block1");
        StaticBlock block1 = new StaticBlock();
        System.out.println("Created block1");
        System.out.println("--------------------");
        System.out.println("Creating block2");
        StaticBlock block2 = new StaticBlock();
        System.out.println("Created block2");
    }

    public void makeStaticBlockObjectWithData() {
        System.out.println("data="+StaticBlock.getData());
        StaticBlock block3 = new StaticBlock();
        block3.data=1;
        System.out.println("-----------------");
        StaticBlock block4 = new StaticBlock();
        block4.data=2;
        System.out.println("data="+StaticBlock.getData());
    }
}

// 결과
// Creating block1
// *** First static block. ***
// *** Second static block. ***
// StaticBlocck Constructor.
// Created block1
// --------------------
// Creating block2
// StaticBlocck Constructor.
// Created block2