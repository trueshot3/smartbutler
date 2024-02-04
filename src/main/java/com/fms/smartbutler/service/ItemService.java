package com.fms.smartbutler.service;

/**
* @author 정시운
* @editDate 2024-01-29 ~ 2024-01-31
*/

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.fms.smartbutler.domain.Item;
import com.fms.smartbutler.dto.ItemDTO;
import com.fms.smartbutler.repository.ItemKindRepository;
import com.fms.smartbutler.repository.ItemRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class ItemService {
	
	private final ItemRepository itemRepository;
	private final ItemKindRepository itemKindRepository;
	private final ModelMapper modelMapper;
	
	public void insert(ItemDTO itemDTO) {
		Item item = modelMapper.map(itemDTO, Item.class);
		
		itemRepository.save(item);
		itemDTO.setItemId(item.getItemId());
	}
	
	public void update(ItemDTO itemDTO) {
		Item item = modelMapper.map(itemDTO, Item.class);
		
		itemRepository.save(item);
		itemDTO.setItemId(item.getItemId());
	}
	
	public Optional<ItemDTO> findById(Long itemId) {
		Optional<Item> item = itemRepository.findById(itemId);
		ItemDTO itemDTO = modelMapper.map(item, ItemDTO.class);
		
		return Optional.ofNullable(itemDTO);
	}
	
	public List<ItemDTO.ItemKindDTO> findAllItemKind() {
		return itemKindRepository.findAll().stream().map(i ->
			modelMapper.map(i, ItemDTO.ItemKindDTO.class)).collect(Collectors.toList());
	}
	
	public List<ItemDTO> findByBuildId(Long buildId) {
		return itemRepository.findByBuild_BuildId(buildId).stream().map(i ->
			modelMapper.map(i, ItemDTO.class)).collect(Collectors.toList());
	}
	
	public List<ItemDTO> findAll() {
		return itemRepository.findAll().stream().map(i ->
			modelMapper.map(i, ItemDTO.class)).collect(Collectors.toList());
	}

	public void delete(ItemDTO itemDTO) {
		Item item = modelMapper.map(itemDTO, Item.class);
		
		itemRepository.delete(item);
	}
}
