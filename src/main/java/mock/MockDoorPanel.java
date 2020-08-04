package mock;

public class MockDoorPanel extends DoorPanel{
    private boolean isCalled = false;

    @Override
    public void close() {
        super.close();
        isCalled = true;
    }

    public boolean closeIsCalled() {
        return isCalled;
    }
}
