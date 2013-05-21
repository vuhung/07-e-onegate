<%
/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
%>

<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>

<%
String cssPath = ParamUtil.getString(request, "cssPath");
int height = ParamUtil.getInteger(request, "height", 265);
String toolbarSet = ParamUtil.getString(request, "toolbarSet", "liferay");

if(toolbarSet.equals("Basic") || toolbarSet.equals("editInPlace")) {
	height = height - 82;
} else if(toolbarSet.equals("email") || toolbarSet.equals("liferayArticle")) {
	height = height - 113;
} else {
	height = height - 144;
}
%>

CKEDITOR.addStylesSet(
	'liferayStyles',
	[

	// Block Styles

	{name: 'Normal', element : 'p'},
	{name: 'Heading 1', element : 'h1'},
	{name: 'Heading 2', element : 'h2'},
	{name: 'Heading 3', element : 'h3'},
	{name: 'Heading 4', element : 'h4'},

	//Special classes

	{name: 'Preformatted Text', element:'pre'},
	{name: 'Cited Work', element:'cite'},
	{name: 'Computer Code', element:'code'},

	//Custom styles

	{name : 'Info Message', element : 'div', attributes : {'class' : 'portlet-msg-info'}},
	{name : 'Alert Message', element : 'div', attributes : {'class' : 'portlet-msg-alert'}},
	{name : 'Error Message', element : 'div', attributes : {'class' : 'portlet-msg-error'}}
	]
);

CKEDITOR.config.contentsCss = '<%= HtmlUtil.escape(cssPath) %>/main.css';

CKEDITOR.config.entities = false;

CKEDITOR.config.resize_enabled = false;

CKEDITOR.config.height = <%= height %>;

CKEDITOR.config.stylesCombo_stylesSet = 'liferayStyles';

CKEDITOR.config.toolbar_liferay = [
	['Styles', 'FontSize', '-', 'TextColor', 'BGColor'],
	['Bold', 'Italic', 'Underline', 'StrikeThrough'],
	['Subscript', 'Superscript'],
	'/',
	['Undo', 'Redo', '-', 'Cut', 'Copy', 'Paste', 'PasteText', 'PasteFromWord', '-', 'SelectAll', 'RemoveFormat'],
	['Find', 'Replace', 'SpellCheck'],
	['OrderedList', 'UnorderedList', '-', 'Outdent', 'Indent'],
	['JustifyLeft', 'JustifyCenter', 'JustifyRight', 'JustifyBlock'],
	'/',
	['Source'],
	['Link', 'Unlink', 'Anchor'],
	['Image', 'Flash', 'Table', '-', 'Smiley', 'SpecialChar']
];

CKEDITOR.config.toolbar_liferayArticle = [
	['Styles', 'FontSize', '-', 'TextColor', 'BGColor'],
	['Bold', 'Italic', 'Underline', 'StrikeThrough'],
	['Subscript', 'Superscript'],
	'-',
	['Link', 'Unlink', 'Anchor'],
	['Image', 'Flash', 'Table', '-', 'Smiley', 'SpecialChar', 'LiferayPageBreak'],
	'-',
	['Source'],
	'/',
	['Undo', 'Redo', '-', 'Cut', 'Copy', 'Paste', 'PasteText', 'PasteFromWord', '-', 'SelectAll', 'RemoveFormat'],
	['Find', 'Replace', 'SpellCheck'],
	['NumberedList','BulletedList','-','Outdent','Indent','Blockquote'],
	['JustifyLeft', 'JustifyCenter', 'JustifyRight', 'JustifyBlock']
];

CKEDITOR.config.toolbar_editInPlace = [
	['Styles'],
	['Bold', 'Italic', 'Underline', 'StrikeThrough'],
	['Subscript', 'Superscript', 'SpecialChar'],
	['Undo', 'Redo'],
	['SpellCheck'],
	['OrderedList', 'UnorderedList', '-', 'Outdent', 'Indent'], ['Source', 'RemoveFormat'],
];

CKEDITOR.config.toolbar_email = [
	['FontSize', 'TextColor', 'BGColor', '-', 'Bold', 'Italic', 'Underline', 'StrikeThrough'],
	['JustifyLeft', 'JustifyCenter', 'JustifyRight', 'JustifyBlock'],
	['SpellCheck'],
	'/',
	['Undo', 'Redo', '-', 'Cut', 'Copy', 'Paste', 'PasteText', 'PasteFromWord', '-', 'SelectAll', 'RemoveFormat'],
	['Source'],
	['Link', 'Unlink'],
	['Image']
];