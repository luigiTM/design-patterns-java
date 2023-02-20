package structural.decorator.datasource.decorator;

import structural.decorator.datasource.Datasource;

public class DatasourceDecorator implements Datasource {

    protected Datasource wrappee;

    public DatasourceDecorator(Datasource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }

}
