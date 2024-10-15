package telran.view;

public class Menu implements Item {
    String name;
    
    @Override
    public String displayName() {
        return name;
    }

    @Override
    public void perform(InputOutput io) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'perform'");
    }

    @Override
    public boolean isExit() {
        return false;
    }

}
