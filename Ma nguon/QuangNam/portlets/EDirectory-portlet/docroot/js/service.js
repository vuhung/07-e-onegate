Liferay.Service.register("Liferay.Service.edir", "com.vsi.edirectory.portlet.service");

Liferay.Service.registerClass(
	Liferay.Service.edir, "EDFunction",
	{
		addFunction: true,
		updateFunction: true,
		removeFunction: true,
		addFunctionResources: true
	}
);