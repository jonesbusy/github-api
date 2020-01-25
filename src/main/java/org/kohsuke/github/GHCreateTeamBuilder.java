package org.kohsuke.github;

import java.io.IOException;
import java.util.List;

/**
 * Creates a team.
 */
public class GHCreateTeamBuilder {

    private final GitHub root;
    protected final Requester builder;
    private final String apiUrlTail;

    public GHCreateTeamBuilder(GitHub root, String apiUrlTail, String name) {
        this.root = root;
        this.apiUrlTail = apiUrlTail;
        this.builder = root.createRequest();
        this.builder.with("name", name);
    }

    /**
     * Description for this team.
     *
     * @param description
     *            description of team
     * @return a builder to continue with building
     */
    public GHCreateTeamBuilder description(String description) {
        this.builder.with("description", description);
        return this;
    }

    /**
     * Maintainers for this team.
     *
     * @param maintainers
     *            maintainers of team
     * @return a builder to continue with building
     */
    public GHCreateTeamBuilder maintainers(List<String> maintainers) {
        this.builder.with("maintainers", maintainers);
        return this;
    }

    /**
     * Repo names to add this team to.
     *
     * @param repoNames
     *            repoNames to add team to
     * @return a builder to continue with building
     */
    public GHCreateTeamBuilder repoNames(List<String> repoNames) {
        this.builder.with("repo_names", repoNames);
        return this;
    }

    /**
     * Description for this team
     *
     * @param privacy
     *            privacy of team
     * @return a builder to continue with building
     */
    public GHCreateTeamBuilder privacy(GHTeam.Privacy privacy) {
        this.builder.with("privacy", privacy);
        return this;
    }

    /**
     * Parent team id for this team
     *
     * @param parentTeamId
     *            parentTeamId of team
     * @return a builder to continue with building
     */
    public GHCreateTeamBuilder parentTeamId(int parentTeamId) {
        this.builder.with("parent_team_id", parentTeamId);
        return this;
    }

    /**
     * Creates a team with all the parameters.
     *
     * @return the gh team
     * @throws IOException
     *             if team cannot be created
     */
    public GHTeam create() throws IOException {
        return builder.method("POST").withUrlPath(apiUrlTail).fetch(GHTeam.class).wrapUp(root);
    }
}
