package structural.decorator.datasource.decorator;

import structural.decorator.datasource.Datasource;

public class CompressionDecorator extends DatasourceDecorator {

    public CompressionDecorator(Datasource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        //Compress data
        super.writeData(data);
    }

    @Override
    public String readData() {
        //Decompress data
        return super.readData();
    }
}
