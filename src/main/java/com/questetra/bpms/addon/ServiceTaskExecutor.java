package com.questetra.bpms.addon;

/**
 * サービスタスクが実行すべきインターフェース
 * @author hatanaka
 */
public interface ServiceTaskExecutor {
    /**
     * @throws Exception
     */
    public void execute() throws Exception;
}
