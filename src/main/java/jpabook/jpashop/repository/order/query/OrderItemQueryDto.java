package jpabook.jpashop.repository.order.query;

import lombok.Data;

@Data
public class OrderItemQueryDto {
    private Long id;
    private String name;
    private int orderPrice;
    private int count;

    public OrderItemQueryDto(Long id, String name, int orderPrice, int count) {
        this.id = id;
        this.name = name;
        this.orderPrice = orderPrice;
        this.count = count;
    }
}
