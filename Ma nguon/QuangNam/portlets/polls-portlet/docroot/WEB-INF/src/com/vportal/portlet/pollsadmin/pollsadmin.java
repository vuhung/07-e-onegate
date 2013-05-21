package com.vportal.portlet.pollsadmin;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vportal.portlet.pollsadmin.action.EditQuestionAction;
import com.vportal.portlet.pollsadmin.model.PollsQuestion;
import com.vportal.portlet.pollsadmin.model.impl.PollsQuestionImpl;
import com.vportal.portlet.pollsadmin.service.PollsQuestionServiceUtil;
import com.vportal.portlet.pollsadmin.service.PollsVoteLocalServiceUtil;
/**
 * Portlet implementation class pollsadmin
 */
public class pollsadmin extends MVCPortlet {
		EditQuestionAction abc = new EditQuestionAction();
		public void addnew (ActionRequest req,ActionResponse response)
			{
			
			  try {
				abc.updateQuestion(req);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public void editquestion(ActionRequest req,ActionResponse response)
			{
			String questionId = ParamUtil.getString(req, "questionId");
			PollsQuestion question = new PollsQuestionImpl();
			try {
				question = PollsQuestionServiceUtil.getQuestion(Long.parseLong(questionId));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			req.setAttribute("POLLS_QUESTION",question);
			response.setRenderParameter("jspPage", "/html/portlet/pollsadmin/edit_question.jsp");
			}
		public void delete(ActionRequest req, ActionResponse response)
			{
			    String questionId  = ParamUtil.getString(req, "questionId");
			    try {
					PollsQuestionServiceUtil.deleteQuestion(Long.parseLong(questionId));
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    response.setRenderParameter("jspPage", "/html/portlet/pollsadmin/view.jsp");
			
			}
	 	    
		}
