package io.harness.cfsdk.utils;

/**
 * Various utils for the SDK.
 */
public class CfUtils {

    private CfUtils() {
    }

    /**
     * Text utils.
     */
    public static class Text {

        private Text() {
        }

        /**
         * Check if the text is empty.
         *
         * @param text Text to check.
         * @return True == Text is empty.
         */
        public static boolean isEmpty(String text) {

            return text == null || text.isEmpty();
        }

        /**
         * Check if the text is not empty.
         *
         * @param text Text to check.
         * @return True == Text is not empty.
         */
        public static boolean isNotEmpty(String text) {

            return !isEmpty(text);
        }
    }
}
