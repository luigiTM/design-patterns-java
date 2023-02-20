package structural.decorator.datasource.decorator;

import structural.decorator.datasource.Datasource;

public class EncryptionDecorator extends DatasourceDecorator {

    public EncryptionDecorator(Datasource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        //Encrypt data
        super.writeData(data);
    }

    @Override
    public String readData() {
        //Decrypt data
        return super.readData();
    }
}
