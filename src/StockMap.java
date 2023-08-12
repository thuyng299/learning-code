import java.util.*;

public class StockMap {
    public static void main(String[] args) {
        List<Stock> stocks = List.of(
                new Stock("A1", 8.5),
                new Stock("S1", 9.0),
                new Stock("A2", 4.0),
                new Stock("A7", 3.9)
        );

        Map<String, Stock> stockMap = stocks.stream()
                .sorted(Comparator.comparingDouble(Stock::getSharePrice))
                .collect(LinkedHashMap::new, (map, stock) -> map.put(stock.getSymbol(), stock), LinkedHashMap::putAll);

        for (Stock stock : stocks) {
            stockMap.put(stock.getSymbol(), stock);
        }

        for (Stock stock : stockMap.values()) {
            System.out.println(stock);
            System.out.println("--------------------------");
        }


//        Map<String, Stock> stockMap = new LinkedHashMap<>();
//
//        Map<String, Stock> stockMap = new HashMap<>();
//
//        Stock stock1 = new Stock("A1", 8.5);
//        Stock stock2 = new Stock("S1", 9.0);
//        Stock stock3 = new Stock("A2", 4.0);
//        Stock stock4 = new Stock("A7", 3.9);
//
//        stockMap.put(stock1.getSymbol(), stock1);
//        stockMap.put(stock2.getSymbol(), stock2);
//        stockMap.put(stock3.getSymbol(), stock3);
//        stockMap.put(stock4.getSymbol(), stock4);
//
//        for (Map.Entry<String, Stock> stock: stockMap.entrySet()
//             ) {
//            System.out.println(stock.getValue());
//            System.out.println("--------------------------");
//        }

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter your wanted symbol: ");
        String inputSymbol = kb.nextLine();

        Stock foundStock = stockMap.get(inputSymbol);
        if (foundStock != null) {
            System.out.println(foundStock);
        } else {
            System.out.println("NOT FOUND");
        }
    }
}
