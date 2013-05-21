package com.vportal.portlet.pollsdisplay;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portlet.polls.NoSuchChoiceException;
import com.liferay.portlet.polls.NoSuchQuestionException;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vportal.portlet.pollsadmin.DuplicateVoteException;
import com.vportal.portlet.pollsadmin.QuestionExpiredException;
import com.vportal.portlet.pollsadmin.action.WebKeys;
import com.vportal.portlet.pollsadmin.model.PollsQuestion;
import com.vportal.portlet.pollsadmin.service.PollsChoiceLocalServiceUtil;
import com.vportal.portlet.pollsadmin.service.PollsQuestionServiceUtil;
import com.vportal.portlet.pollsadmin.service.PollsVoteServiceUtil;
import com.vportal.portlet.pollsadmin.util.PollsUtil;

/**
 * Portlet implementation class pollsdisplay
 */
public class pollsdisplay extends MVCPortlet {

	public void configs(ActionRequest req, ActionResponse res) {

		try {
			EditPreferencesAction edits = new EditPreferencesAction();

			edits.processAction(req, res);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	{
	}

	public void vote(ActionRequest request,
			ActionResponse res){

		String cmd = ParamUtil.getString(request, Constants.CMD);

		try {

			PortletPreferences prefs = request.getPreferences();

			long questionId = GetterUtil.getLong(prefs.getValue("question-id",
					StringPool.BLANK));

			boolean guestVote = GetterUtil.getBoolean(
					prefs.getValue("guestVote", "true"), true);

			PollsQuestion question = PollsQuestionServiceUtil
					.getQuestion(questionId);

			question = question.toEscapedModel();

			List choices = PollsChoiceLocalServiceUtil.getChoices(question
					.getQuestionId());
			request.setAttribute("choices", choices);

			if (cmd.equals(Constants.ADD)) {
				long choiceId = ParamUtil.getLong(request, "choiceId");

				request.setAttribute("choiceId", String.valueOf(choiceId));

				try {

					PollsVoteServiceUtil.addVote(question.getQuestionId(),
							choiceId, guestVote);

					PollsUtil.saveVote(request, question.getQuestionId());

					SessionMessages.add(request, "vote_added");

				}

				catch (DuplicateVoteException dve) {
					SessionErrors.add(request, dve.getClass().getName());
				} catch (NoSuchChoiceException nsce) {
					SessionErrors.add(request, nsce.getClass().getName());
				} catch (QuestionExpiredException qee) {

				}
			}

			request.setAttribute(WebKeys.POLLS_QUESTION, question);

			res.setRenderParameter("jspPage", "/html/portlet/pollsdisplay/view.jsp");

		} catch (NoSuchQuestionException nsqe) {

			res.setRenderParameter("jspPage", "/html/portlet/pollsdisplay/edit.jsp");
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void showresults(ActionRequest req,ActionResponse res)
	{
		
		long questionId = ParamUtil.getLong(req, "questionId");
		PollsQuestion question = null;
		try {
			question = PollsQuestionServiceUtil.getQuestion(questionId);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List choices = null;
		try {
			choices = PollsChoiceLocalServiceUtil.getChoices(question
					.getQuestionId());
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		req.setAttribute("questionId", String.valueOf(questionId));
		req.setAttribute(WebKeys.POLLS_QUESTION, question);
		req.setAttribute("choices", choices);
		
		res.setRenderParameter("jspPage","/html/portlet/pollsdisplay/results.jsp");
		
		
	}

}