//package com.zkf.forjob.controller;
//
//import com.sudytech.core.mybaits.base.LayuiGrid;
//import com.sudytech.core.mybaits.base.Paging;
//import com.sudytech.log.ILog;
//import com.sudytech.log.LogFactory;
//import com.sudytech.mybaits.apps.cleansystem.web.model.DyModel;
//import com.sudytech.mybaits.apps.cleansystem.web.model.DyModelExample;
//import com.sudytech.mybaits.apps.cleansystem.web.service.IDyService;
//import com.sudytech.security.ids.SSOUser;
//import com.sudytech.system.base.mvc.BaseController;
//import com.sudytech.system.base.mvc.ResultCode;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
//@RequestMapping("_web/_apps/cleansystem/dyhz")
//@Controller
//public class NormalController extends BaseController {
//
//    private static final ILog log = LogFactory.getInstance().getLog(NormalController.class);
//
//    @Autowired
//    private IDyService dyService;
//
//    @RequestMapping(value = "select", method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
//    public LayuiGrid select(Paging paging, DyModel searchModel) {
//        SSOUser ssoUser = this.getCurrentUser();
//        if (ssoUser.isAnonymous()) {
//            return new LayuiGrid(ResultCode.ERROR.getCode(), "请先登录");
//        }
//        try {
//            DyModelExample dyModelExample = new DyModelExample();
//            DyModelExample.Criteria criteria = dyModelExample.createCriteria();
//            int beginIndex = paging.getBeginIndex();
//            int rows = paging.getRows();
//            dyModelExample.setOffset((long) beginIndex);
//            dyModelExample.setLimit(rows);
//            // 年份
//            if (!StringUtils.isEmpty(searchModel.getNd())) {
//                criteria.andNdEqualTo(searchModel.getNd());
//            }
//            if (null != searchModel.getTradeDepartmentId()) {
//                criteria.andTradeDepartmentIdEqualTo(searchModel.getTradeDepartmentId());
//            }
//            if (!StringUtils.isEmpty(searchModel.getTradeDepartment())) {
//                criteria.andTradeDepartmentLike("%" + searchModel.getTradeDepartment() + "%");
//            }
//            List<DyModel> dyModels = dyService.selectByExample(dyModelExample);
//            long total = dyService.countByExample(dyModelExample);
//            return new LayuiGrid((int) total, dyModels);
//        } catch (Exception e) {
//            log.error("dy add error", e);
//            return new LayuiGrid(ResultCode.ERROR.getCode(), "dy select error");
//        }
//    }
//
//    @RequestMapping(value = "add", method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
//    public LayuiGrid add(DyModel dyModel) {
//        SSOUser ssoUser = this.getCurrentUser();
//        if (ssoUser.isAnonymous()) {
//            return new LayuiGrid(ResultCode.ERROR.getCode(), "请先登录");
//        }
//        try {
//            int i = dyService.insert(dyModel);
//            if (i == 0) {
//                return new LayuiGrid(ResultCode.ERROR.getCode(), "dy add error");
//            }
//            return new LayuiGrid(ResultCode.SUCCESS.getCode(), "dy add success");
//        } catch (Exception e) {
//            log.error("dy add error", e);
//            return new LayuiGrid(ResultCode.ERROR.getCode(), "dy add error");
//        }
//    }
//
//    @RequestMapping(value = "init", method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
//    public LayuiGrid init(String id) {
//        SSOUser ssoUser = this.getCurrentUser();
//        if (ssoUser.isAnonymous()) {
//            return new LayuiGrid(ResultCode.ERROR.getCode(), "请先登录");
//        }
//        try {
//            DyModel dyModel = dyService.selectByPrimaryKey(Integer.valueOf(id));
//            return new LayuiGrid(ResultCode.SUCCESS.getCode(), dyModel);
//        } catch (Exception e) {
//            log.error("dy add error", e);
//            return new LayuiGrid(ResultCode.ERROR.getCode(), "dy init error");
//        }
//    }
//
//    @RequestMapping(value = "update", method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
//    public LayuiGrid update(DyModel dyModel) {
//        SSOUser ssoUser = this.getCurrentUser();
//        if (ssoUser.isAnonymous()) {
//            return new LayuiGrid(ResultCode.ERROR.getCode(), "请先登录");
//        }
//        try {
//            int i = dyService.updateByPrimaryKey(dyModel);
//            if (i == 0) {
//                return new LayuiGrid(ResultCode.ERROR.getCode(), "dy update error");
//            }
//            return new LayuiGrid(ResultCode.SUCCESS.getCode(), "dy update success");
//        } catch (Exception e) {
//            log.error("dy add error", e);
//            return new LayuiGrid(ResultCode.ERROR.getCode(), "dy update error");
//        }
//    }
//
//    @RequestMapping(value = "delete", method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
//    public LayuiGrid delete(String idList) {
//        SSOUser ssoUser = this.getCurrentUser();
//        if (ssoUser.isAnonymous()) {
//            return new LayuiGrid(ResultCode.ERROR.getCode(), "请先登录");
//        }
//        try {
//            String[] ids = idList.split(",");
//            for (String id : ids) {
//                int i = dyService.deleteByPrimaryKey(Integer.valueOf(id));
//                if (i == 0) {
//                    return new LayuiGrid(ResultCode.ERROR.getCode(), "dy delete error");
//                }
//            }
//            return new LayuiGrid(ResultCode.SUCCESS.getCode(), "dy delete success");
//        } catch (Exception e) {
//            log.error("dy add error", e);
//            return new LayuiGrid(ResultCode.ERROR.getCode(), "dy delete error");
//        }
//    }
//
//}
