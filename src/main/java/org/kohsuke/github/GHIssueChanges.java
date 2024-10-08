package org.kohsuke.github;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

// TODO: Auto-generated Javadoc
/**
 * Wrapper to define changed fields on issues action="edited".
 *
 * @see GHEventPayload.Issue
 */
@SuppressFBWarnings("UWF_UNWRITTEN_FIELD")
public class GHIssueChanges {

    /**
     * Create default GHIssueChanges instance
     */
    public GHIssueChanges() {
    }

    private GHFrom title;
    private GHFrom body;

    /**
     * Old issue title.
     *
     * @return old issue title (or null if not changed)
     */
    public GHFrom getTitle() {
        return title;
    }

    /**
     * Old issue body.
     *
     * @return old issue body (or null if not changed)
     */
    public GHFrom getBody() {
        return body;
    }

    /**
     * Wrapper for changed values.
     */
    public static class GHFrom {

        /**
         * Create default GHFrom instance
         */
        public GHFrom() {
        }

        private String from;

        /**
         * Previous value that was changed.
         *
         * @return previous value
         */
        public String getFrom() {
            return from;
        }
    }
}
