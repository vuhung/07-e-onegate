/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.vportal.portlet.pollsdisplay;

import java.util.List;

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
import com.vportal.portlet.pollsadmin.model.PollsQuestion;
import com.vportal.portlet.pollsadmin.service.PollsChoiceLocalServiceUtil;
import com.vportal.portlet.pollsadmin.service.PollsQuestionServiceUtil;
import com.vportal.portlet.pollsadmin.service.PollsVoteServiceUtil;
import com.vportal.portlet.pollsadmin.util.PollsUtil;

/**
 * <a href="ViewAction.java.html"><b><i>View Source</i></b></a>
 * 
 * @author Brian Wing Shun Chan
 * 
 */
public class ViewAction extends MVCPortlet {

	public void ActionForward(PortletConfig config, RenderRequest request, RenderResponse res)
			{

		String cmd = ParamUtil.getString(request, Constants.CMD);

		try {

			PortletPreferences prefs = request.getPreferences();

			long questionId = GetterUtil.getLong(prefs.getValue("question-id",
					StringPool.BLANK));

			boolean guestVote = GetterUtil.getBoolean(prefs.getValue(
					"guestVote", "true"), true);

			PollsQuestion question = PollsQuestionServiceUtil.getQuestion(questionId);

			question = question.toEscapedModel();

			List choices = PollsChoiceLocalServiceUtil.getChoices(question.getQuestionId());
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

				} catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			request.setAttribute(com.vportal.portlet.pollsadmin.action.WebKeys.POLLS_QUESTION, question);

//			 res.findForward("portlet.vpolls.view");

		} catch (NoSuchQuestionException nsqe) {

//			 res.findForward("/portal/portlet_not_setup");
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}