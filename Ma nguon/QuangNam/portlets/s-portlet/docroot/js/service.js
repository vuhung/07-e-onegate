Liferay.Service.register("Liferay.Service.s", "com.test.service");

Liferay.Service.registerClass(
	Liferay.Service.s, "AdvType",
	{
		addType: true,
		updateType: true,
		deleteType: true,
		getType: true,
		getItemCount: true,
		getTypeByG: true,
		countTypeByG: true,
		addAdvTypeResources: true
	}
);

Liferay.Service.registerClass(
	Liferay.Service.s, "AdvItem",
	{
		addItem: true,
		updateItem: true,
		deleteItem: true,
		deleteItembyType: true,
		getItem: true,
		getAllbyType: true,
		getItemByG: true,
		countItemByG: true,
		getItemByG_S: true,
		countItemByG_S: true,
		getItemByG_T_S: true,
		countItemByG_T_S: true,
		countItemByG_T: true,
		addAdvItemResources: true,
		getItemByParam: true,
		countItemByParam: true
	}
);