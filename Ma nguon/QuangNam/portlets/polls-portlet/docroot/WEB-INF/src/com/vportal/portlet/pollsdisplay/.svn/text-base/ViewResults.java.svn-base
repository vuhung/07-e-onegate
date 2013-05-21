package com.vportal.portlet.pollsdisplay;

import java.util.List;

import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portlet.polls.model.PollsQuestion;
import com.liferay.portlet.polls.service.PollsChoiceLocalServiceUtil;
import com.liferay.portlet.polls.service.PollsQuestionServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vportal.portlet.pollsadmin.action.WebKeys;

public class ViewResults extends MVCPortlet {

	
	public void ActionForward(PortletConfig config, RenderRequest req, RenderResponse res)
			throws Exception {
		
		long questionId = ParamUtil.getLong(req, "questionId");
		PollsQuestion question = PollsQuestionServiceUtil.getQuestion(questionId);
		List choices = PollsChoiceLocalServiceUtil.getChoices(question
				.getQuestionId());		
		
		req.setAttribute("questionId", String.valueOf(questionId));
		req.setAttribute(WebKeys.POLLS_QUESTION, question);
		req.setAttribute("choices", choices);
		
//		res.findForward("portlet.vpolls.results");
	}

}
