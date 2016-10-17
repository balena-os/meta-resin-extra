# Resin.io extra layer for all supported boards

## Description
This repository enables building extra/optional packages on top of meta-resin

## Layer dependencies

This layer depends on:

* URI: git://git.yoctoproject.org/poky
* URI: git://github.com/openembedded/meta-openembedded
    * layers: meta-oe, meta-networking, meta-python
* URI: git://git.yoctoproject.org/poky
* URI: https://github.com/resin-os/meta-resin.git
    * layers: meta-resin-common, meta-resin-<yocto-version>

## Contributing

### Issues

For issues we use an aggregated github repository available [here](https://github.com/resin-os/resinos/issues). When you create issue make sure you select the right labels.

### Pull requests

To contribute send github pull requests targeting this repository.

Please refer to: [Yocto Contribution Guidelines](https://wiki.yoctoproject.org/wiki/Contribution_Guidelines#General_Information) and try to use the commit log format as stated there. Example:
```
test.bb: I added a test

[Issue #01]

I'm going to explain here what my commit does in a way that history
would be useful.

Signed-off-by: Joe Developer <joe.developer@example.com>
```

Make sure you mention the issue addressed by a PR. See:
* https://help.github.com/articles/autolinked-references-and-urls/#issues-and-pull-requests
* https://help.github.com/articles/closing-issues-via-commit-messages/#closing-an-issue-in-a-different-repository
