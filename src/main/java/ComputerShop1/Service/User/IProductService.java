package ComputerShop1.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ComputerShop1.DTO.ProductsDTO;

@Service
public interface IProductService {
	@Autowired
	public ProductsDTO GetProductByID(long id);
	public List<ProductsDTO> GetProductByIDCategory(long id);
}
