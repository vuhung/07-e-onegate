Liferay.Service.register("Liferay.Service.vcomment", "com.vportal.portlet.vcomment.service");

Liferay.Service.registerClass(
	Liferay.Service.vcomment, "VComment",
	{
		addComment: true,
		updateContact: true,
		deleteContact: true,
		getAll: true,
		getByStatus: true,
		getByG_S: true,
		getContact: true,
		addContact: true
	}
);