package aggregators;

import fileprocessors.StockFileReader;

import java.io.IOException;
import java.util.List;

public class AggregatorProcessor<E extends Aggregator> {
    E operation;
    String filePath;
    public AggregatorProcessor(E operation, String filePath) {
        super();
        this.operation=operation;
        this.filePath=filePath;
    }

    public double runAggregator(int colIdx) throws IOException {
        StockFileReader fileReader= new StockFileReader(filePath);
        List<String> lines = fileReader.readFileData();
        colIdx--;
        for(String line:lines) {
            String[] elements = line.split(",");
            double value = Double.parseDouble((elements[colIdx]));
            operation.add(value);
        }
        return operation.calculate();
    }
}
