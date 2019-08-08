# Introduction 

This repository contains a listing of Design-Build-Test-Learn (DBTL)
tasks (aka steps) in CSV format. The data provided in this repository
is derived from TasCu curation tool (https://tascu.vtt.fi), and will be
periodically updated.

This table contains the following columns:

| Column Name | Column description |
| ----------- | ------------------ |
| id          | unique id of the task |
| parent_id   | id of the parent task |
| position    | position of this task (=child number) under its parent |
| step_name   | name of the task |
| step_desc   | description of the task |
| organism    | the microbial host organism in which this task is applicable |
| sop_url     | URL of the protocol (should point to IBISBAHub) |
| duration_in_days | time it takes to perform the task |
| part_of_service | the IBISBA service/offering this task is part of |
| comments | Comments related to the task description or its contents |
| success_rate | Success rate (a number between 0 and 1) based on IBISBA expert's experience |
| created | time stamp when the task description was created in TasCu |
| last_modified | time stamp when the task description was last modified in TasCu |
