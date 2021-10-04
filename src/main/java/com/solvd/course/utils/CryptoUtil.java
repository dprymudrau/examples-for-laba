package com.solvd.course.utils;

import com.qaprosoft.carina.core.foundation.commons.SpecialKeywords;
import com.qaprosoft.carina.core.foundation.crypto.CryptoTool;
import com.qaprosoft.carina.core.foundation.crypto.SecretKeyManager;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

public class CryptoUtil {
    private final static Logger LOGGER = LogManager.getLogger(CryptoUtil.class);
    private final static String KEY_FILE_PATH = "src/main/resources/crypto.key";
    private static String cryptoKey = getKeyFromFile(KEY_FILE_PATH);
    private static CryptoTool cryptoTool = new CryptoTool(SpecialKeywords.CRYPTO_ALGORITHM, SpecialKeywords.CRYPTO_KEY_TYPE, SecretKeyManager.getKey(cryptoKey, SpecialKeywords.CRYPTO_KEY_TYPE));
    private static Pattern cryptoPattern = Pattern.compile(SpecialKeywords.CRYPT);

    public static String decrypt(String str) {
        return cryptoTool.decryptByPattern(str, cryptoPattern);
    }

    public static String encrypt(String str) {
        return cryptoTool.encrypt(str);
    }

    private static String getKeyFromFile(String keyFilePath) {
        File file = new File(keyFilePath);
        try {
            return FileUtils.readFileToString(file, Charset.defaultCharset());
        } catch (IOException e) {
            LOGGER.error("Problem while reading file");
            throw new RuntimeException(e);
        }
    }

}
