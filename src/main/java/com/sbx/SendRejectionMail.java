package com.sbx;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * @author : sbx
 * @Classname : SendRejectionMail
 * @Description : TODO
 * @Date : 2023/8/17 11:50
 */
public class SendRejectionMail implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) {
        System.out.println("请假被拒绝,,,安心工作吧");
    }
}
