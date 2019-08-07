package tacos.dao;

import tacos.Order;

public interface OrderRepository {
	Order save(Order order);
}
