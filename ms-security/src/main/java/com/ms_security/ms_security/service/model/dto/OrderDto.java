package com.ms_security.ms_security.service.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class OrderDto implements Serializable {
    @NotNull(message = "The id field cannot be null", groups = Update.class)
    @Null(message = "The id field must be null", groups = Create.class)
    @Min(value = 1, message = "The minimum value for id is 1")
    private Long id;

    @NotNull(message = "The userId field cannot be null", groups = {Create.class, Update.class})
    private Long userId;

    @NotNull(message = "The totalCost field cannot be null", groups = {Create.class, Update.class})
    private BigDecimal totalCost;

    @NotNull(message = "The status field cannot be null", groups = {Create.class, Update.class})
    private String status;

    @NotNull(message = "The createUser field cannot be null", groups = Create.class)
    @Null(message = "The createUser field must be null", groups = Update.class)
    private String createUser;

    @NotNull(message = "The updateUser field cannot be null", groups = Update.class)
    @Null(message = "The updateUser field must be null", groups = Create.class)
    private String updateUser;

    @NotNull(message = "The items field cannot be null", groups = {OrderItemDto.Create.class, OrderItemDto.Update.class})
    private List<OrderItemDto> items;

    public interface Create {}
    public interface Update {}
}