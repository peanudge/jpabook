package jpabook.jpashop.repository.order.query;

import lombok.Data;

@Data
public class OrderItemQueryDto {
    private Long orderId;
    private String itemName;
    private int orderPrice;
    private int count;

    public OrderItemQueryDto(Long id, String name, int orderPrice, int count) {
        this.orderId = id;
        this.itemName = name;
        this.orderPrice = orderPrice;
        this.count = count;
    }
}
