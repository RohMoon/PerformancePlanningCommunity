package moon.aggregations.v1.order.presentation;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import moon.aggregations.v1.order.presentation.dto.req.CreateOrderDto;
import moon.config.annotations.Get;
import moon.config.annotations.Post;
import moon.config.annotations.RestApi;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestApi("/v1/orders")
public class OrderController {

    @Get
    public List<String> getOrders() {
        return List.of("A", "B", "C");
    }

    @Post
    public long createOrders(@RequestBody @Valid CreateOrderDto request){
        return 0L;
    }
}
