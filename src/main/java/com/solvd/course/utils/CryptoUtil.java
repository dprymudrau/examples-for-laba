package com.solvd.course.utils;

import com.zebrunner.carina.crypto.Algorithm;
import com.zebrunner.carina.crypto.CryptoTool;
import com.zebrunner.carina.crypto.CryptoToolBuilder;
import com.zebrunner.carina.crypto.SecretKeyManager;
import com.zebrunner.carina.utils.commons.SpecialKeywords;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

public class CryptoUtil {
    private final static Logger LOGGER = LogManager.getLogger(CryptoUtil.class);
    private final static String KEY_FILE_PATH = "src/main/resources/crypto.key";
    private static String cryptoKey = getKeyFromFile(KEY_FILE_PATH);
    private static CryptoTool cryptoTool = CryptoToolBuilder
            .builder()
            .chooseAlgorithm(Algorithm.AES_ECB_PKCS5_PADDING)
            .setKey(cryptoKey)
            .build();
    private static Pattern cryptoPattern = Pattern.compile(SpecialKeywords.CRYPT);

    public static String decrypt(String str) {
        return cryptoTool.decrypt(str, cryptoPattern.pattern());
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
