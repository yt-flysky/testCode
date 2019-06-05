// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RequestInfo.java

package weaver.soa.workflow.request;

import java.io.Serializable;
import weaver.conn.RecordSetTrans;
import weaver.workflow.request.RequestManager;

// Referenced classes of package weaver.soa.workflow.request:
//			MainTableInfo, DetailTableInfo, RequestLog

public class RequestInfo
	implements Serializable
{

	private RecordSetTrans _rstrans;
	private String _workflowid;
	private String _requestid;
	private String _creatorid;
	private String _description;
	private String _requestlevel;
	private String _remindtype;
	private String _hostid;
	private String _lastoperator;
	private MainTableInfo _mainTableInfo;
	private DetailTableInfo _detailTableInfo;
	private RequestLog _requestLog;
	private RequestManager _RequestManager;
	private String _isNextFlow;

	public RequestInfo()
	{
	}

	public String getCreatorid()
	{
		return _creatorid;
	}

	public String getDescription()
	{
		return _description;
	}

	public DetailTableInfo getDetailTableInfo()
	{
		return _detailTableInfo;
	}

	public String getHostid()
	{
		return _hostid;
	}

	public String getIsNextFlow()
	{
		return _isNextFlow;
	}

	public String getLastoperator()
	{
		return _lastoperator;
	}

	public MainTableInfo getMainTableInfo()
	{
		return _mainTableInfo;
	}

	public String getRemindtype()
	{
		return _remindtype;
	}

	public RequestLog getRequestLog()
	{
		return _requestLog;
	}

	public RequestManager getRequestManager()
	{
		return _RequestManager;
	}

	public String getRequestid()
	{
		return _requestid;
	}

	public String getRequestlevel()
	{
		return _requestlevel;
	}

	public RecordSetTrans getRsTrans()
	{
		return _rstrans;
	}

	public String getWorkflowid()
	{
		return _workflowid;
	}

	public void setCreatorid(String s)
	{
		_creatorid = s;
	}

	public void setDescription(String s)
	{
		_description = s;
	}

	public void setDetailTableInfo(DetailTableInfo detailtableinfo)
	{
		_detailTableInfo = detailtableinfo;
	}

	public void setHostid(String s)
	{
		_hostid = s;
	}

	public void setIsNextFlow(String s)
	{
		_isNextFlow = s;
	}

	public void setLastoperator(String s)
	{
		_lastoperator = s;
	}

	public void setMainTableInfo(MainTableInfo maintableinfo)
	{
		_mainTableInfo = maintableinfo;
	}

	public void setRemindtype(String s)
	{
		_remindtype = s;
	}

	public void setRequestLog(RequestLog requestlog)
	{
		_requestLog = requestlog;
	}

	public void setRequestManager(RequestManager requestmanager)
	{
		_RequestManager = requestmanager;
	}

	public void setRequestid(String s)
	{
		_requestid = s;
	}

	public void setRequestlevel(String s)
	{
		_requestlevel = s;
	}

	public void setRsTrans(RecordSetTrans recordsettrans)
	{
		_rstrans = recordsettrans;
	}

	public void setWorkflowid(String s)
	{
		_workflowid = s;
	}
}
