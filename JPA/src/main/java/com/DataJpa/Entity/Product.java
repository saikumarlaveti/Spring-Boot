package com.DataJpa.Entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Product")
public class Product {
	@Id
	@Column(name="pid")
	private Integer pid;
	
	
	@Column(name="pname")
	private String pname;
	
	@ElementCollection
	@CollectionTable(name="prod_vendors",joinColumns = @JoinColumn(name="pidFK"))
	@Column(name="vendors")
	private Set<String> Vendors;
	
	@ElementCollection
	@CollectionTable(name="prod_versions",joinColumns= @JoinColumn(name="pidFK"))
	@OrderColumn(name="pos")
	private List<String> versions;
	
	@ElementCollection
	@CollectionTable(name="prod_clients",joinColumns = @JoinColumn(name="pidFK"))
	@Column(name="cname")
	@MapKeyColumn(name="code")
	private Map<String,String> clients;
	
}
